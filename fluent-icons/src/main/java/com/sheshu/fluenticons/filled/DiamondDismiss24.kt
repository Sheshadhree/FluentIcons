package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DiamondDismiss24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DiamondDismiss24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.952f, 14.299f)
            curveToRelative(-1.27f, -1.27f, -1.27f, -3.327f, 0f, -4.597f)
            lineToRelative(6.75f, -6.75f)
            curveToRelative(1.27f, -1.27f, 3.327f, -1.27f, 4.597f, 0f)
            lineToRelative(6.75f, 6.75f)
            curveToRelative(1.27f, 1.27f, 1.27f, 3.327f, 0f, 4.597f)
            lineToRelative(-6.75f, 6.75f)
            curveToRelative(-1.27f, 1.27f, -3.327f, 1.27f, -4.597f, 0f)
            lineToRelative(-6.75f, -6.75f)
            close()
            moveToRelative(6.828f, -5.58f)
            curveToRelative(-0.293f, -0.292f, -0.767f, -0.292f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.294f, -0.293f, 0.768f, 0f, 1.061f)
            lineTo(10.94f, 12f)
            lineToRelative(-2.22f, 2.22f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(12f, 13.06f)
            lineToRelative(2.22f, 2.22f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(13.06f, 12f)
            lineToRelative(2.22f, -2.22f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(12f, 10.94f)
            lineTo(9.78f, 8.72f)
            close()
        }
    }.build()
}
