package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ProjectionScreen16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProjectionScreen16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 14f, 10.5f, 14f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 14f, 5f, 13.776f, 5f, 13.5f)
            reflectiveCurveTo(5.224f, 13f, 5.5f, 13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-3f)
            curveTo(3.12f, 12f, 2f, 10.88f, 2f, 9.5f)
            verticalLineTo(4f)
            curveTo(1.448f, 4f, 1f, 3.552f, 1f, 3f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(12f)
            close()
        }
    }.build()
}
