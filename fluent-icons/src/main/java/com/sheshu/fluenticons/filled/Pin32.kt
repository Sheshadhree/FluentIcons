package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pin32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pin32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.744f, 4.276f)
            curveToRelative(1.221f, -2.442f, 4.476f, -2.97f, 6.406f, -1.04f)
            lineToRelative(6.614f, 6.614f)
            curveToRelative(1.93f, 1.93f, 1.402f, 5.186f, -1.04f, 6.406f)
            lineToRelative(-6.35f, 3.176f)
            curveToRelative(-0.356f, 0.178f, -0.627f, 0.49f, -0.753f, 0.867f)
            lineToRelative(-1.66f, 4.983f)
            curveToRelative(-0.47f, 1.41f, -2.26f, 1.833f, -3.312f, 0.782f)
            lineToRelative(-4.149f, -4.15f)
            lineToRelative(-6.086f, 6.087f)
            horizontalLineTo(4f)
            verticalLineToRelative(-1.415f)
            lineToRelative(6.086f, -6.085f)
            lineToRelative(-4.149f, -4.15f)
            curveToRelative(-1.051f, -1.05f, -0.629f, -2.84f, 0.782f, -3.31f)
            lineToRelative(4.982f, -1.662f)
            curveToRelative(0.378f, -0.125f, 0.69f, -0.396f, 0.868f, -0.752f)
            lineToRelative(3.175f, -6.35f)
            close()
        }
    }.build()
}
