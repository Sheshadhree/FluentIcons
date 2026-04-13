package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronUp20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronUp20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.147f, 12.353f)
            curveToRelative(-0.196f, -0.194f, -0.196f, -0.511f, -0.001f, -0.707f)
            lineTo(9.61f, 6.162f)
            curveToRelative(0.215f, -0.216f, 0.564f, -0.216f, 0.779f, 0f)
            lineToRelative(5.465f, 5.484f)
            curveToRelative(0.195f, 0.196f, 0.194f, 0.512f, -0.001f, 0.707f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            lineTo(10f, 7.187f)
            lineToRelative(-5.146f, 5.164f)
            curveToRelative(-0.195f, 0.196f, -0.511f, 0.196f, -0.707f, 0.001f)
            close()
        }
    }.build()
}
