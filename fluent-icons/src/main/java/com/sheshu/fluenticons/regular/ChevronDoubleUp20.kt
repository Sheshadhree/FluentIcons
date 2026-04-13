package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronDoubleUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronDoubleUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.146f, 9.646f)
            curveTo(3.95f, 9.842f, 3.95f, 10.158f, 4.147f, 10.353f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, -0.001f)
            lineTo(10f, 5.187f)
            lineToRelative(5.146f, 5.165f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0.001f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0.001f, -0.707f)
            lineTo(10.39f, 4.162f)
            curveToRelative(-0.215f, -0.216f, -0.565f, -0.216f, -0.78f, 0f)
            lineTo(4.146f, 9.646f)
            close()
            moveToRelative(0f, 5.001f)
            curveTo(3.95f, 14.843f, 3.95f, 15.16f, 4.147f, 15.354f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.707f, -0.001f)
            lineTo(10f, 10.188f)
            lineToRelative(5.146f, 5.165f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0.001f)
            curveToRelative(0.196f, -0.195f, 0.196f, -0.511f, 0.001f, -0.707f)
            lineTo(10.39f, 9.163f)
            curveToRelative(-0.215f, -0.216f, -0.565f, -0.216f, -0.78f, 0f)
            lineToRelative(-5.464f, 5.484f)
            close()
        }
    }.build()
}
