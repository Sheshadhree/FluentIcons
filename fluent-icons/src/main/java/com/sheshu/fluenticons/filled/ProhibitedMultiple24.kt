package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ProhibitedMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ProhibitedMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.05f, 6.05f)
            curveToRelative(2.494f, -2.493f, 6.4f, -2.712f, 9.143f, -0.657f)
            lineToRelative(-9.8f, 9.8f)
            curveTo(3.338f, 12.45f, 3.557f, 8.543f, 6.05f, 6.05f)
            close()
            moveToRelative(0.758f, 10.557f)
            lineToRelative(9.799f, -9.8f)
            curveToRelative(2.055f, 2.742f, 1.836f, 6.65f, -0.657f, 9.143f)
            curveToRelative(-2.494f, 2.493f, -6.4f, 2.712f, -9.142f, 0.657f)
            close()
            moveTo(17.363f, 4.636f)
            curveToRelative(-3.515f, -3.515f, -9.213f, -3.515f, -12.728f, 0f)
            curveToRelative(-3.515f, 3.515f, -3.515f, 9.213f, 0f, 12.728f)
            curveToRelative(3.515f, 3.515f, 9.213f, 3.515f, 12.728f, 0f)
            curveToRelative(3.515f, -3.515f, 3.515f, -9.213f, 0f, -12.728f)
            close()
            moveTo(21f, 11f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            curveToRelative(-0.985f, 0f, -1.936f, -0.142f, -2.835f, -0.407f)
            curveTo(9.563f, 21.483f, 11.221f, 22f, 13f, 22f)
            curveToRelative(4.97f, 0f, 9f, -4.03f, 9f, -9f)
            curveToRelative(0f, -1.78f, -0.516f, -3.438f, -1.407f, -4.835f)
            curveTo(20.858f, 9.065f, 21f, 10.015f, 21f, 11f)
            close()
        }
    }.build()
}
