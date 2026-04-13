package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Diamond24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Diamond24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.952f, 9.702f)
            curveToRelative(-1.27f, 1.27f, -1.27f, 3.327f, 0f, 4.597f)
            lineToRelative(6.75f, 6.75f)
            curveToRelative(1.27f, 1.27f, 3.327f, 1.27f, 4.597f, 0f)
            lineToRelative(6.75f, -6.75f)
            curveToRelative(1.27f, -1.27f, 1.27f, -3.327f, 0f, -4.597f)
            lineToRelative(-6.75f, -6.75f)
            curveToRelative(-1.27f, -1.27f, -3.327f, -1.27f, -4.597f, 0f)
            lineToRelative(-6.75f, 6.75f)
            close()
        }
    }.build()
}
