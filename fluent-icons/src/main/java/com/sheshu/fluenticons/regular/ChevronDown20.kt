package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.854f, 7.646f)
            curveToRelative(0.195f, 0.195f, 0.196f, 0.511f, 0.001f, 0.707f)
            lineToRelative(-5.465f, 5.484f)
            curveToRelative(-0.215f, 0.216f, -0.564f, 0.216f, -0.78f, 0f)
            lineTo(4.147f, 8.353f)
            curveToRelative(-0.197f, -0.196f, -0.197f, -0.513f, 0f, -0.707f)
            curveTo(4.343f, 7.45f, 4.66f, 7.452f, 4.854f, 7.647f)
            lineTo(10f, 12.812f)
            lineToRelative(5.147f, -5.165f)
            curveToRelative(0.194f, -0.196f, 0.511f, -0.196f, 0.707f, -0.001f)
            close()
        }
    }.build()
}
