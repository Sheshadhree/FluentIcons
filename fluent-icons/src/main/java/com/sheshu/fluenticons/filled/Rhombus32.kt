package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Rhombus32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Rhombus32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.524f, 5f)
            curveTo(9.194f, 5f, 8f, 5.81f, 7.506f, 7.043f)
            lineToRelative(-6.2f, 15.5f)
            curveTo(0.452f, 24.678f, 2.024f, 27f, 4.324f, 27f)
            horizontalLineToRelative(17.153f)
            curveToRelative(1.329f, 0f, 2.524f, -0.81f, 3.017f, -2.043f)
            lineToRelative(6.2f, -15.5f)
            curveTo(31.548f, 7.322f, 29.976f, 5f, 27.677f, 5f)
            horizontalLineTo(10.524f)
            close()
        }
    }.build()
}
