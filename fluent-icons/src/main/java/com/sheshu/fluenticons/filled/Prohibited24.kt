package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Prohibited24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Prohibited24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.906f, 5.68f)
            curveTo(13.768f, 3.237f, 9.228f, 3.458f, 6.343f, 6.343f)
            curveTo(3.458f, 9.228f, 3.237f, 13.768f, 5.68f, 16.906f)
            lineTo(16.906f, 5.68f)
            close()
            moveToRelative(1.414f, 1.414f)
            lineTo(7.094f, 18.32f)
            curveToRelative(3.138f, 2.443f, 7.678f, 2.222f, 10.563f, -0.663f)
            curveToRelative(2.885f, -2.885f, 3.106f, -7.425f, 0.663f, -10.563f)
            close()
            moveTo(4.93f, 4.929f)
            curveToRelative(3.905f, -3.905f, 10.237f, -3.905f, 14.142f, 0f)
            curveToRelative(3.905f, 3.905f, 3.905f, 10.237f, 0f, 14.142f)
            curveToRelative(-3.905f, 3.905f, -10.237f, 3.905f, -14.142f, 0f)
            curveToRelative(-3.905f, -3.905f, -3.905f, -10.237f, 0f, -14.142f)
            close()
        }
    }.build()
}
