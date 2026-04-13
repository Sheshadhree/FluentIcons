package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ReOrder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ReOrder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.75f, 9.25f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 9.25f, 14f, 9.586f, 14f, 10f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(13.25f, 10.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10.75f, 2f, 10.414f, 2f, 10f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(2.75f, 9.25f)
            horizontalLineToRelative(10.5f)
            horizontalLineToRelative(-10.5f)
            close()
            moveToRelative(0f, -4f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 5.25f, 14f, 5.586f, 14f, 6f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(13.25f, 6.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 6.75f, 2f, 6.414f, 2f, 6f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(2.75f, 5.25f)
            horizontalLineToRelative(10.5f)
            horizontalLineToRelative(-10.5f)
            close()
        }
    }.build()
}
