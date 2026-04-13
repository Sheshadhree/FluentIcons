package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DiamondDismiss12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DiamondDismiss12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.581f, 1.582f)
            curveToRelative(0.781f, -0.781f, 2.047f, -0.781f, 2.828f, 0f)
            lineToRelative(3f, 3f)
            curveToRelative(0.78f, 0.781f, 0.78f, 2.047f, 0f, 2.828f)
            lineToRelative(-3f, 3f)
            curveToRelative(-0.78f, 0.781f, -2.047f, 0.781f, -2.828f, 0f)
            lineToRelative(-2.999f, -3f)
            curveTo(0.85f, 6.678f, 0.804f, 5.52f, 1.444f, 4.734f)
            lineToRelative(0.138f, -0.152f)
            lineToRelative(3f, -3f)
            close()
            moveToRelative(3.273f, 2.564f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            lineTo(6f, 5.293f)
            lineTo(4.854f, 4.146f)
            lineTo(4.775f, 4.082f)
            curveTo(4.582f, 3.954f, 4.317f, 3.976f, 4.146f, 4.146f)
            curveToRelative(-0.17f, 0.171f, -0.192f, 0.435f, -0.064f, 0.63f)
            lineToRelative(0.064f, 0.078f)
            lineTo(5.293f, 6f)
            lineTo(4.146f, 7.146f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            lineTo(6f, 6.707f)
            lineToRelative(1.147f, 1.147f)
            lineToRelative(0.078f, 0.064f)
            curveToRelative(0.194f, 0.128f, 0.458f, 0.106f, 0.629f, -0.064f)
            curveToRelative(0.17f, -0.171f, 0.192f, -0.435f, 0.064f, -0.63f)
            lineTo(7.854f, 7.147f)
            lineTo(6.707f, 6f)
            lineToRelative(1.147f, -1.146f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            close()
        }
    }.build()
}
