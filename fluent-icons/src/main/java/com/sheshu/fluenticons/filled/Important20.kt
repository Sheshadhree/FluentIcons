package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Important20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Important20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(8.343f, 2f, 7f, 3.343f, 7f, 5f)
            curveToRelative(0f, 2.227f, 0.789f, 5.204f, 1.225f, 6.685f)
            curveTo(8.459f, 12.48f, 9.19f, 13f, 10f, 13f)
            curveToRelative(0.81f, 0f, 1.54f, -0.518f, 1.775f, -1.31f)
            curveTo(12.212f, 10.213f, 13f, 7.25f, 13f, 5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(0f, 12f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
