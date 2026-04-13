package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clock16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clock16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 15f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveTo(8f, 4.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(2.5f)
            curveTo(10.776f, 8f, 11f, 8.224f, 11f, 8.5f)
            reflectiveCurveTo(10.776f, 9f, 10.5f, 9f)
            horizontalLineToRelative(-3f)
            curveTo(7.224f, 9f, 7f, 8.776f, 7f, 8.5f)
            verticalLineToRelative(-4f)
            curveTo(7f, 4.224f, 7.224f, 4f, 7.5f, 4f)
            reflectiveCurveTo(8f, 4.224f, 8f, 4.5f)
            close()
        }
    }.build()
}
