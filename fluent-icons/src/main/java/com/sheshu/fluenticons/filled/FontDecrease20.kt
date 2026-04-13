package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FontDecrease20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FontDecrease20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.238f, 2.18f)
            curveToRelative(-0.314f, -0.269f, -0.788f, -0.233f, -1.057f, 0.082f)
            curveToRelative(-0.27f, 0.314f, -0.233f, 0.788f, 0.081f, 1.057f)
            lineToRelative(1.75f, 1.5f)
            curveToRelative(0.28f, 0.241f, 0.695f, 0.241f, 0.976f, 0f)
            lineToRelative(1.75f, -1.5f)
            curveToRelative(0.315f, -0.27f, 0.351f, -0.743f, 0.081f, -1.057f)
            curveToRelative(-0.27f, -0.315f, -0.743f, -0.351f, -1.057f, -0.081f)
            lineTo(15.5f, 3.262f)
            lineToRelative(-1.262f, -1.081f)
            close()
            moveTo(10f, 4f)
            curveTo(9.694f, 4f, 9.42f, 4.185f, 9.305f, 4.469f)
            lineToRelative(-4.25f, 10.5f)
            curveToRelative(-0.155f, 0.383f, 0.03f, 0.82f, 0.414f, 0.976f)
            curveToRelative(0.384f, 0.155f, 0.821f, -0.03f, 0.976f, -0.414f)
            lineTo(7.875f, 12f)
            horizontalLineToRelative(4.25f)
            lineToRelative(1.43f, 3.531f)
            curveToRelative(0.155f, 0.384f, 0.592f, 0.57f, 0.976f, 0.414f)
            curveToRelative(0.384f, -0.155f, 0.57f, -0.593f, 0.414f, -0.977f)
            lineToRelative(-4.25f, -10.5f)
            curveTo(10.581f, 4.186f, 10.305f, 4f, 10f, 4f)
            close()
            moveToRelative(0f, 2.749f)
            lineToRelative(1.518f, 3.75f)
            horizontalLineTo(8.482f)
            lineTo(10f, 6.75f)
            close()
        }
    }.build()
}
