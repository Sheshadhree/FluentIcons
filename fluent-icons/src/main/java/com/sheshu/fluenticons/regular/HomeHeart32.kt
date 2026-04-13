package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HomeHeart32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HomeHeart32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.19f, 4.3f)
            curveToRelative(0.467f, -0.396f, 1.153f, -0.396f, 1.62f, 0f)
            lineToRelative(9.75f, 8.288f)
            curveToRelative(0.279f, 0.238f, 0.44f, 0.586f, 0.44f, 0.953f)
            verticalLineToRelative(0.974f)
            curveToRelative(0.683f, 0.049f, 1.36f, 0.219f, 2f, 0.511f)
            verticalLineTo(13.54f)
            curveToRelative(0f, -0.953f, -0.419f, -1.858f, -1.145f, -2.476f)
            lineToRelative(-9.75f, -8.287f)
            curveToRelative(-1.214f, -1.032f, -2.996f, -1.032f, -4.21f, 0f)
            lineToRelative(-9.75f, 8.287f)
            curveTo(3.42f, 11.682f, 3f, 12.587f, 3f, 13.54f)
            verticalLineTo(26.5f)
            curveTo(3f, 27.88f, 4.12f, 29f, 5.5f, 29f)
            horizontalLineToRelative(12.61f)
            lineToRelative(-1.857f, -2f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 27f, 5f, 26.776f, 5f, 26.5f)
            verticalLineTo(13.54f)
            curveToRelative(0f, -0.366f, 0.161f, -0.714f, 0.44f, -0.952f)
            lineToRelative(9.75f, -8.287f)
            close()
            moveToRelative(7.307f, 14.204f)
            lineToRelative(-0.646f, -0.82f)
            curveToRelative(-1.618f, -2.052f, -4.592f, -2.257f, -6.463f, -0.445f)
            curveToRelative(-1.784f, 1.73f, -1.858f, 4.623f, -0.165f, 6.447f)
            lineToRelative(6.459f, 6.955f)
            curveToRelative(0.444f, 0.478f, 1.186f, 0.479f, 1.63f, 0f)
            lineToRelative(6.462f, -6.949f)
            curveToRelative(1.698f, -1.826f, 1.623f, -4.726f, -0.167f, -6.457f)
            curveToRelative(-1.872f, -1.81f, -4.846f, -1.604f, -6.464f, 0.449f)
            lineToRelative(-0.646f, 0.82f)
            close()
        }
    }.build()
}
