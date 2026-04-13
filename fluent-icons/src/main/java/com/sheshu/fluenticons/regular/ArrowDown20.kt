package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.867f, 10.837f)
            curveToRelative(0.186f, -0.204f, 0.171f, -0.52f, -0.033f, -0.706f)
            curveToRelative(-0.203f, -0.186f, -0.52f, -0.172f, -0.706f, 0.032f)
            lineToRelative(-5.63f, 6.168f)
            verticalLineTo(2.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            curveToRelative(-0.277f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(13.828f)
            lineToRelative(-5.629f, -6.165f)
            curveTo(3.683f, 9.959f, 3.367f, 9.945f, 3.163f, 10.13f)
            curveToRelative(-0.204f, 0.186f, -0.218f, 0.502f, -0.032f, 0.706f)
            lineToRelative(6.314f, 6.916f)
            curveToRelative(0.127f, 0.14f, 0.295f, 0.22f, 0.468f, 0.24f)
            curveTo(9.941f, 17.998f, 9.97f, 18f, 9.997f, 18f)
            curveToRelative(0.027f, 0f, 0.054f, -0.002f, 0.08f, -0.006f)
            curveToRelative(0.175f, -0.018f, 0.346f, -0.099f, 0.476f, -0.24f)
            lineToRelative(6.314f, -6.917f)
            close()
        }
    }.build()
}
