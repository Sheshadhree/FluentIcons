package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Diamond28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Diamond28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.098f, 11.348f)
            curveToRelative(-1.464f, 1.465f, -1.464f, 3.839f, 0f, 5.303f)
            lineToRelative(8.25f, 8.25f)
            curveToRelative(1.465f, 1.465f, 3.839f, 1.465f, 5.303f, 0f)
            lineToRelative(8.25f, -8.25f)
            curveToRelative(1.465f, -1.464f, 1.465f, -3.838f, 0f, -5.303f)
            lineToRelative(-8.25f, -8.25f)
            curveToRelative(-1.464f, -1.464f, -3.838f, -1.464f, -5.303f, 0f)
            lineToRelative(-8.25f, 8.25f)
            close()
        }
    }.build()
}
