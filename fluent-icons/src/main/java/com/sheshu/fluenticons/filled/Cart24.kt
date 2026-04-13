package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Cart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Cart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 4.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(0.558f)
            curveToRelative(0.95f, 0f, 1.52f, 0.639f, 1.845f, 1.233f)
            curveTo(5.87f, 5.129f, 6.027f, 5.588f, 6.15f, 6.004f)
            curveTo(6.183f, 6.001f, 6.217f, 6f, 6.25f, 6f)
            horizontalLineToRelative(12.498f)
            curveToRelative(0.83f, 0f, 1.43f, 0.794f, 1.202f, 1.593f)
            lineToRelative(-1.828f, 6.409f)
            curveToRelative(-0.336f, 1.181f, -1.416f, 1.996f, -2.644f, 1.996f)
            horizontalLineTo(9.53f)
            curveToRelative(-1.239f, 0f, -2.324f, -0.828f, -2.652f, -2.022f)
            lineToRelative(-0.76f, -2.772f)
            lineToRelative(-1.26f, -4.248f)
            lineToRelative(-0.001f, -0.008f)
            curveTo(4.7f, 6.38f, 4.555f, 5.85f, 4.337f, 5.454f)
            curveTo(4.128f, 5.069f, 3.96f, 5f, 3.809f, 5f)
            horizontalLineTo(3.25f)
            curveTo(2.836f, 5f, 2.5f, 4.664f, 2.5f, 4.25f)
            close()
            moveTo(9f, 21f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
        }
    }.build()
}
