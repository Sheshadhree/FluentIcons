package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagOff24",
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
            lineTo(14.377f, 16.5f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(4.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.744f)
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
            horizontalLineToRelative(-1.633f)
            lineTo(5.117f, 2.999f)
            close()
        }
    }.build()
}
