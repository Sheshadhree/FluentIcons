package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Checkmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Checkmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.046f, 3.486f)
            curveToRelative(0.284f, 0.301f, 0.27f, 0.776f, -0.032f, 1.06f)
            lineToRelative(-7.93f, 7.474f)
            curveToRelative(-0.336f, 0.317f, -0.864f, 0.307f, -1.188f, -0.022f)
            lineToRelative(-2.68f, -2.72f)
            curveToRelative(-0.291f, -0.296f, -0.287f, -0.77f, 0.008f, -1.061f)
            curveToRelative(0.295f, -0.291f, 0.77f, -0.288f, 1.06f, 0.008f)
            lineToRelative(2.234f, 2.267f)
            lineToRelative(7.468f, -7.038f)
            curveToRelative(0.301f, -0.284f, 0.776f, -0.27f, 1.06f, 0.032f)
            close()
        }
    }.build()
}
