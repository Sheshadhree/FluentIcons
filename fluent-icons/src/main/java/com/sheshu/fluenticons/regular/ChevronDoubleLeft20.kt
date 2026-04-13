package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronDoubleLeft20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronDoubleLeft20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.353f, 15.854f)
            curveToRelative(-0.194f, 0.195f, -0.511f, 0.196f, -0.707f, 0.001f)
            lineTo(5.162f, 10.39f)
            curveToRelative(-0.216f, -0.215f, -0.216f, -0.564f, 0f, -0.78f)
            lineToRelative(5.484f, -5.464f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.707f, 0.001f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineTo(6.187f, 10f)
            lineToRelative(5.164f, 5.147f)
            curveToRelative(0.196f, 0.194f, 0.196f, 0.511f, 0.001f, 0.707f)
            close()
            moveToRelative(4f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.512f, 0.196f, -0.708f, 0.001f)
            lineTo(9.161f, 10.39f)
            curveToRelative(-0.216f, -0.215f, -0.216f, -0.564f, 0f, -0.78f)
            lineToRelative(5.484f, -5.464f)
            curveToRelative(0.196f, -0.195f, 0.513f, -0.195f, 0.707f, 0.001f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.707f)
            lineTo(10.186f, 10f)
            lineToRelative(5.164f, 5.147f)
            curveToRelative(0.196f, 0.194f, 0.196f, 0.511f, 0.001f, 0.707f)
            close()
        }
    }.build()
}
