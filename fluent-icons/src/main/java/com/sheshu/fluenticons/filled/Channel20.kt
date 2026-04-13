package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Channel20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Channel20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.466f, 3f, 3.579f, 3.628f, 3.198f, 4.523f)
            curveTo(3.297f, 4.508f, 3.398f, 4.5f, 3.5f, 4.5f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            curveTo(3.327f, 8.5f, 3.16f, 8.478f, 3f, 8.437f)
            verticalLineTo(14.5f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(7f, 8.5f)
            curveTo(7f, 8.224f, 7.224f, 8f, 7.5f, 8f)
            horizontalLineToRelative(5f)
            curveTo(12.776f, 8f, 13f, 8.224f, 13f, 8.5f)
            reflectiveCurveTo(12.776f, 9f, 12.5f, 9f)
            horizontalLineToRelative(-5f)
            curveTo(7.224f, 9f, 7f, 8.776f, 7f, 8.5f)
            close()
            moveTo(7.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 12f, 10.5f, 12f)
            horizontalLineToRelative(-3f)
            curveTo(7.224f, 12f, 7f, 11.776f, 7f, 11.5f)
            reflectiveCurveTo(7.224f, 11f, 7.5f, 11f)
            close()
            moveToRelative(-4f, -5.5f)
            curveTo(3.318f, 5.5f, 3.147f, 5.549f, 3f, 5.634f)
            curveTo(2.701f, 5.807f, 2.5f, 6.13f, 2.5f, 6.5f)
            reflectiveCurveTo(2.701f, 7.193f, 3f, 7.366f)
            curveTo(3.147f, 7.451f, 3.318f, 7.5f, 3.5f, 7.5f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
        }
    }.build()
}
