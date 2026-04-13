package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MailOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(1.355f, 1.354f)
            curveToRelative(-0.803f, 0.35f, -1.386f, 1.11f, -1.486f, 2.015f)
            lineTo(10f, 10.92f)
            lineToRelative(0.134f, -0.079f)
            lineToRelative(0.73f, 0.73f)
            lineToRelative(-0.61f, 0.36f)
            curveToRelative(-0.157f, 0.092f, -0.351f, 0.092f, -0.507f, 0f)
            lineTo(2f, 7.373f)
            verticalLineTo(14.5f)
            curveTo(2f, 15.88f, 3.12f, 17f, 4.5f, 17f)
            horizontalLineToRelative(11f)
            curveToRelative(0.241f, 0f, 0.474f, -0.034f, 0.695f, -0.098f)
            lineToRelative(0.951f, 0.952f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveToRelative(9.792f, 8.377f)
            lineToRelative(5.093f, 5.092f)
            curveTo(17.906f, 15.28f, 18f, 14.901f, 18f, 14.5f)
            verticalLineTo(7.373f)
            lineToRelative(-5.355f, 3.15f)
            close()
            moveTo(6.121f, 4f)
            lineToRelative(5.794f, 5.793f)
            lineToRelative(6.07f, -3.57f)
            curveTo(17.847f, 4.973f, 16.787f, 4f, 15.5f, 4f)
            horizontalLineTo(6.121f)
            close()
        }
    }.build()
}
