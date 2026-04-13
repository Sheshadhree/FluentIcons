package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.002f, 15.29f)
            lineToRelative(2.645f, -2.644f)
            curveToRelative(0.195f, -0.195f, 0.512f, -0.195f, 0.707f, 0f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.512f, 0f, 0.707f)
            lineTo(9.886f, 16.82f)
            curveTo(9.794f, 16.931f, 9.656f, 17f, 9.502f, 17f)
            horizontalLineTo(9.501f)
            curveToRelative(-0.079f, 0f, -0.158f, -0.018f, -0.23f, -0.055f)
            curveToRelative(-0.044f, -0.023f, -0.087f, -0.054f, -0.125f, -0.092f)
            lineToRelative(-0.01f, -0.01f)
            lineToRelative(-3.49f, -3.49f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.512f, 0f, -0.707f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            lineToRelative(2.648f, 2.649f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            curveToRelative(0.277f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(11.79f)
            close()
        }
    }.build()
}
