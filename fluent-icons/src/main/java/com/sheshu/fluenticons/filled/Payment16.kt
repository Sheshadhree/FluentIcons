package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Payment16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Payment16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.12f, 3f, 1f, 4.12f, 1f, 5.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(14f)
            verticalLineTo(5.5f)
            curveTo(15f, 4.12f, 13.88f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(15f, 7f)
            horizontalLineTo(1f)
            verticalLineToRelative(3.5f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(7f)
            close()
            moveToRelative(-4.5f, 3f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(12.776f, 11f, 12.5f, 11f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
