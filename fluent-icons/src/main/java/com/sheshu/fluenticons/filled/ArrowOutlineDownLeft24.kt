package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowOutlineDownLeft24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowOutlineDownLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.166f, 21.986f)
            curveToRelative(-1.242f, 0.138f, -2.292f, -0.911f, -2.154f, -2.153f)
            lineTo(3.352f, 7.77f)
            curveToRelative(0.181f, -1.625f, 2.161f, -2.32f, 3.317f, -1.163f)
            lineToRelative(1.268f, 1.267f)
            lineTo(13.24f, 2.57f)
            curveToRelative(0.762f, -0.761f, 1.996f, -0.761f, 2.758f, 0f)
            lineTo(21.427f, 8f)
            curveToRelative(0.762f, 0.76f, 0.762f, 1.995f, 0f, 2.757f)
            lineToRelative(-5.304f, 5.304f)
            lineToRelative(1.268f, 1.267f)
            curveToRelative(1.156f, 1.156f, 0.461f, 3.136f, -1.164f, 3.317f)
            lineToRelative(-12.061f, 1.34f)
            close()
        }
    }.build()
}
