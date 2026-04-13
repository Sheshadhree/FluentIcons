package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CaretUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CaretUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.797f, 13.908f)
            curveToRelative(-0.84f, 0f, -1.306f, -0.974f, -0.778f, -1.628f)
            lineToRelative(3.814f, -4.723f)
            curveToRelative(0.6f, -0.743f, 1.734f, -0.743f, 2.334f, 0f)
            lineToRelative(3.815f, 4.723f)
            curveToRelative(0.528f, 0.654f, 0.062f, 1.628f, -0.778f, 1.628f)
            horizontalLineTo(5.797f)
            close()
        }
    }.build()
}
