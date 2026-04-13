package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Edit12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Edit12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.736f, 1.56f)
            curveToRelative(0.748f, -0.747f, 1.96f, -0.747f, 2.707f, 0f)
            curveToRelative(0.748f, 0.748f, 0.748f, 1.96f, 0f, 2.708f)
            lineTo(10.21f, 4.502f)
            lineTo(7.502f, 1.795f)
            lineTo(7.736f, 1.56f)
            close()
            moveTo(6.795f, 2.503f)
            lineTo(1.65f, 7.646f)
            curveToRelative(-0.07f, 0.07f, -0.117f, 0.159f, -0.136f, 0.255f)
            lineToRelative(-0.504f, 2.5f)
            curveToRelative(-0.033f, 0.164f, 0.018f, 0.334f, 0.136f, 0.452f)
            curveToRelative(0.118f, 0.119f, 0.288f, 0.17f, 0.452f, 0.137f)
            lineToRelative(2.504f, -0.5f)
            curveToRelative(0.097f, -0.019f, 0.186f, -0.067f, 0.255f, -0.136f)
            lineToRelative(5.145f, -5.145f)
            lineToRelative(-2.707f, -2.707f)
            close()
        }
    }.build()
}
