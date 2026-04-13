package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FontIncrease20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FontIncrease20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.238f, 4.82f)
            curveToRelative(-0.314f, 0.269f, -0.788f, 0.232f, -1.057f, -0.082f)
            curveToRelative(-0.27f, -0.314f, -0.233f, -0.788f, 0.081f, -1.058f)
            lineToRelative(1.75f, -1.5f)
            curveToRelative(0.28f, -0.24f, 0.695f, -0.24f, 0.976f, 0f)
            lineToRelative(1.75f, 1.5f)
            curveToRelative(0.315f, 0.27f, 0.351f, 0.744f, 0.081f, 1.058f)
            curveToRelative(-0.27f, 0.314f, -0.743f, 0.351f, -1.057f, 0.081f)
            lineTo(15.5f, 3.738f)
            lineToRelative(-1.262f, 1.081f)
            close()
            moveTo(10f, 3.75f)
            curveToRelative(-0.305f, 0f, -0.579f, 0.184f, -0.694f, 0.466f)
            lineToRelative(-4.5f, 11f)
            curveToRelative(-0.157f, 0.383f, 0.027f, 0.821f, 0.41f, 0.978f)
            curveToRelative(0.384f, 0.157f, 0.821f, -0.027f, 0.978f, -0.41f)
            lineTo(7.64f, 12.25f)
            horizontalLineToRelative(4.72f)
            lineToRelative(1.446f, 3.534f)
            curveToRelative(0.157f, 0.383f, 0.595f, 0.567f, 0.978f, 0.41f)
            curveToRelative(0.383f, -0.157f, 0.567f, -0.595f, 0.41f, -0.978f)
            lineToRelative(-4.5f, -11f)
            curveTo(10.58f, 3.934f, 10.304f, 3.75f, 10f, 3.75f)
            close()
            moveToRelative(0f, 2.73f)
            lineToRelative(1.746f, 4.27f)
            horizontalLineTo(8.255f)
            lineTo(10f, 6.48f)
            close()
        }
    }.build()
}
