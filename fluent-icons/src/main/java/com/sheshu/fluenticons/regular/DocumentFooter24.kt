package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentFooter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentFooter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.501f, 16f)
            curveToRelative(-0.828f, 0f, -1.5f, 0.672f, -1.5f, 1.5f)
            curveToRelative(0f, 0.829f, 0.672f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.829f, 0f, 1.5f, -0.671f, 1.5f, -1.5f)
            curveToRelative(0f, -0.828f, -0.671f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            close()
            moveToRelative(11.49f, -11.908f)
            curveToRelative(-0.08f, -1.17f, -1.054f, -2.096f, -2.245f, -2.096f)
            horizontalLineToRelative(-11.5f)
            lineTo(6.092f, 2.001f)
            curveToRelative(-1.17f, 0.08f, -2.096f, 1.054f, -2.096f, 2.245f)
            verticalLineToRelative(15.498f)
            lineToRelative(0.005f, 0.154f)
            curveToRelative(0.08f, 1.171f, 1.054f, 2.096f, 2.245f, 2.096f)
            horizontalLineToRelative(11.5f)
            lineTo(17.9f, 21.99f)
            curveToRelative(1.17f, -0.08f, 2.096f, -1.054f, 2.096f, -2.245f)
            verticalLineTo(4.246f)
            lineToRelative(-0.005f, -0.154f)
            close()
            moveTo(6.246f, 3.496f)
            horizontalLineToRelative(11.5f)
            lineToRelative(0.102f, 0.007f)
            curveToRelative(0.366f, 0.05f, 0.648f, 0.363f, 0.648f, 0.743f)
            verticalLineToRelative(15.498f)
            lineToRelative(-0.007f, 0.102f)
            curveToRelative(-0.05f, 0.366f, -0.363f, 0.648f, -0.743f, 0.648f)
            horizontalLineToRelative(-11.5f)
            lineToRelative(-0.102f, -0.007f)
            curveToRelative(-0.366f, -0.05f, -0.648f, -0.363f, -0.648f, -0.743f)
            verticalLineTo(4.246f)
            lineToRelative(0.007f, -0.102f)
            curveToRelative(0.05f, -0.366f, 0.363f, -0.648f, 0.743f, -0.648f)
            close()
        }
    }.build()
}
