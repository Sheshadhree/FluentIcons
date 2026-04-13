package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ProtocolHandler16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProtocolHandler16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.586f, 4.414f)
            lineTo(1.413f, 6.585f)
            curveToRelative(-0.781f, 0.782f, -0.781f, 2.048f, 0f, 2.829f)
            lineToRelative(2.171f, 2.171f)
            curveToRelative(0.782f, 0.781f, 2.048f, 0.781f, 2.829f, 0f)
            lineToRelative(2.171f, -2.171f)
            curveToRelative(0.781f, -0.781f, 0.781f, -2.047f, 0f, -2.829f)
            lineToRelative(-2.169f, -2.17f)
            curveToRelative(-0.781f, -0.781f, -2.047f, -0.781f, -2.828f, 0f)
            close()
            moveToRelative(6f, 7.171f)
            lineToRelative(-0.88f, -0.878f)
            lineToRelative(0.587f, -0.586f)
            curveToRelative(1.171f, -1.172f, 1.171f, -3.071f, 0f, -4.243f)
            lineTo(8.707f, 5.293f)
            lineToRelative(0.878f, -0.88f)
            curveToRelative(0.781f, -0.78f, 2.048f, -0.78f, 2.829f, 0f)
            lineToRelative(2.171f, 2.172f)
            curveToRelative(0.781f, 0.782f, 0.781f, 2.048f, 0f, 2.829f)
            lineToRelative(-2.171f, 2.171f)
            curveToRelative(-0.781f, 0.781f, -2.047f, 0.781f, -2.829f, 0f)
            close()
        }
    }.build()
}
