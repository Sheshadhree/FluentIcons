package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortDown24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.65f, 4.007f)
            lineTo(11.75f, 4f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.744f, 0.648f)
            lineToRelative(0.007f, 0.102f)
            lineTo(12.5f, 17.446f)
            lineToRelative(3.22f, -3.221f)
            curveToRelative(0.266f, -0.266f, 0.682f, -0.29f, 0.976f, -0.073f)
            lineToRelative(0.084f, 0.072f)
            curveToRelative(0.267f, 0.267f, 0.29f, 0.683f, 0.073f, 0.977f)
            lineToRelative(-0.072f, 0.084f)
            lineToRelative(-4.497f, 4.5f)
            curveToRelative(-0.266f, 0.266f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineToRelative(-0.084f, -0.073f)
            lineToRelative(-4.504f, -4.5f)
            curveToRelative(-0.293f, -0.292f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.266f, -0.266f, 0.682f, -0.29f, 0.976f, -0.073f)
            lineToRelative(0.084f, 0.072f)
            lineTo(11f, 17.442f)
            verticalLineTo(4.75f)
            curveToRelative(0f, -0.38f, 0.283f, -0.694f, 0.65f, -0.743f)
            lineTo(11.75f, 4f)
            lineToRelative(-0.1f, 0.007f)
            close()
        }
    }.build()
}
