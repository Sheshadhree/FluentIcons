package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            close()
            moveTo(9.5f, 5f)
            curveTo(9.224f, 5f, 9f, 5.224f, 9f, 5.5f)
            verticalLineToRelative(5f)
            lineToRelative(0.008f, 0.09f)
            curveTo(9.05f, 10.823f, 9.255f, 11f, 9.5f, 11f)
            horizontalLineToRelative(3f)
            lineToRelative(0.09f, -0.008f)
            curveTo(12.823f, 10.95f, 13f, 10.745f, 13f, 10.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineTo(10f)
            verticalLineTo(5.5f)
            lineTo(9.992f, 5.41f)
            curveTo(9.95f, 5.177f, 9.745f, 5f, 9.5f, 5f)
            close()
        }
    }.build()
}
