package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FlagOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2.5f)
            lineToRelative(18f, 18f)
            curveToRelative(0.293f, 0.294f, 0.293f, 0.769f, 0f, 1.062f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            lineToRelative(-5.063f, -5.063f)
            lineTo(4.5f, 16.501f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.379f, -0.282f, 0.693f, -0.648f, 0.742f)
            lineTo(3.75f, 22f)
            curveToRelative(-0.38f, 0f, -0.693f, -0.282f, -0.743f, -0.648f)
            lineTo(3f, 21.25f)
            verticalLineTo(5.122f)
            lineToRelative(-1.56f, -1.56f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.061f)
            curveToRelative(0.292f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
            moveToRelative(2.617f, 0.498f)
            horizontalLineToRelative(15.137f)
            curveToRelative(0.618f, 0f, 0.971f, 0.706f, 0.6f, 1.2f)
            lineTo(16.69f, 9.75f)
            lineToRelative(4.164f, 5.55f)
            curveToRelative(0.371f, 0.495f, 0.018f, 1.2f, -0.6f, 1.2f)
            horizontalLineTo(18.62f)
            lineToRelative(-1.5f, -1.5f)
            horizontalLineToRelative(1.634f)
            lineToRelative(-3.602f, -4.8f)
            curveToRelative(-0.2f, -0.267f, -0.2f, -0.634f, 0f, -0.9f)
            lineToRelative(3.602f, -4.802f)
            horizontalLineTo(6.617f)
            lineToRelative(-1.5f, -1.5f)
            close()
            moveTo(4.5f, 6.622f)
            verticalLineToRelative(8.379f)
            lineToRelative(8.377f, -0.002f)
            lineTo(4.5f, 6.622f)
            close()
        }
    }.build()
}
