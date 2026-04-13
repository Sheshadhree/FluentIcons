package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarThreeQuarter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarThreeQuarter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.211f, 3.102f)
            lineTo(15f, 6.727f)
            verticalLineToRelative(0.004f)
            lineToRelative(0.567f, 1.149f)
            lineToRelative(5.273f, 0.766f)
            curveToRelative(1.107f, 0.16f, 1.549f, 1.522f, 0.748f, 2.303f)
            lineToRelative(-3.816f, 3.719f)
            lineToRelative(0.901f, 5.25f)
            curveToRelative(0.19f, 1.104f, -0.968f, 1.945f, -1.959f, 1.424f)
            lineTo(12f, 18.863f)
            lineToRelative(-4.715f, 2.479f)
            curveTo(7.078f, 21.451f, 6.864f, 21.5f, 6.655f, 21.5f)
            curveToRelative(-0.787f, 0f, -1.481f, -0.708f, -1.331f, -1.581f)
            lineToRelative(0.9f, -5.251f)
            lineToRelative(-3.815f, -3.72f)
            curveToRelative(-0.801f, -0.78f, -0.359f, -2.141f, 0.748f, -2.302f)
            lineTo(8.43f, 7.88f)
            lineToRelative(2.358f, -4.778f)
            curveToRelative(0.248f, -0.502f, 0.73f, -0.753f, 1.211f, -0.752f)
            curveToRelative(0.482f, 0f, 0.964f, 0.25f, 1.212f, 0.752f)
            close()
            moveTo(15f, 9.283f)
            verticalLineToRelative(9.463f)
            lineToRelative(2.143f, 1.127f)
            lineToRelative(-0.862f, -5.03f)
            curveToRelative(-0.075f, -0.438f, 0.07f, -0.884f, 0.388f, -1.194f)
            lineToRelative(3.654f, -3.562f)
            lineToRelative(-5.05f, -0.734f)
            curveTo(15.18f, 9.339f, 15.088f, 9.316f, 15f, 9.283f)
            close()
        }
    }.build()
}
