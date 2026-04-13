package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Checkmark20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Checkmark20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.032f, 13.907f)
            lineToRelative(-3.471f, -3.905f)
            curveTo(3.285f, 9.692f, 2.81f, 9.664f, 2.5f, 9.939f)
            curveTo(2.193f, 10.215f, 2.165f, 10.69f, 2.44f, 11f)
            lineToRelative(4f, 4.5f)
            curveToRelative(0.287f, 0.322f, 0.786f, 0.336f, 1.091f, 0.031f)
            lineToRelative(10.5f, -10.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineToRelative(-9.938f, 9.937f)
            close()
        }
    }.build()
}
