package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronDoubleRight20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronDoubleRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.646f, 4.147f)
            curveTo(8.84f, 3.951f, 9.157f, 3.951f, 9.353f, 4.146f)
            lineToRelative(5.484f, 5.465f)
            curveToRelative(0.216f, 0.215f, 0.216f, 0.564f, 0f, 0.779f)
            lineToRelative(-5.484f, 5.465f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.194f, -0.707f, -0.001f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0.001f, -0.707f)
            lineTo(13.812f, 10f)
            lineTo(8.647f, 4.854f)
            curveTo(8.451f, 4.66f, 8.451f, 4.343f, 8.646f, 4.147f)
            close()
            moveToRelative(-4f, 0f)
            curveTo(4.84f, 3.951f, 5.157f, 3.951f, 5.353f, 4.146f)
            lineToRelative(5.484f, 5.465f)
            curveToRelative(0.216f, 0.215f, 0.216f, 0.564f, 0f, 0.779f)
            lineToRelative(-5.484f, 5.465f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.194f, -0.707f, -0.001f)
            curveToRelative(-0.195f, -0.196f, -0.194f, -0.512f, 0.001f, -0.707f)
            lineTo(9.812f, 10f)
            lineTo(4.647f, 4.854f)
            curveTo(4.451f, 4.66f, 4.451f, 4.343f, 4.646f, 4.147f)
            close()
        }
    }.build()
}
