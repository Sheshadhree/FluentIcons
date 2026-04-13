package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReOrderVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrderVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.25f, 13.25f)
            verticalLineTo(2.75f)
            curveTo(9.25f, 2.336f, 9.586f, 2f, 10f, 2f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(10.75f, 2.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(9.25f, 13.25f)
            close()
            moveToRelative(-4f, 0f)
            verticalLineTo(2.75f)
            curveTo(5.25f, 2.336f, 5.586f, 2f, 6f, 2f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(6.75f, 2.75f)
            verticalLineToRelative(10.5f)
            curveTo(6.75f, 13.664f, 6.414f, 14f, 6f, 14f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(5.25f, 13.25f)
            close()
        }
    }.build()
}
