package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleLeft32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleLeft32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.68f, 18.843f)
            curveToRelative(-2.24f, -1.236f, -2.24f, -4.457f, 0.002f, -5.693f)
            lineTo(24.18f, 2.408f)
            curveTo(26.346f, 1.215f, 29f, 2.782f, 29f, 5.255f)
            verticalLineToRelative(21.492f)
            curveToRelative(0f, 2.473f, -2.654f, 4.04f, -4.82f, 2.846f)
            lineTo(4.681f, 18.843f)
            close()
            moveToRelative(0.967f, -3.94f)
            curveToRelative(-0.862f, 0.474f, -0.863f, 1.713f, 0f, 2.189f)
            lineToRelative(19.498f, 10.75f)
            curveToRelative(0.833f, 0.459f, 1.854f, -0.144f, 1.854f, -1.095f)
            verticalLineTo(5.255f)
            curveToRelative(0f, -0.952f, -1.02f, -1.554f, -1.854f, -1.095f)
            lineTo(5.647f, 14.902f)
            close()
        }
    }.build()
}
