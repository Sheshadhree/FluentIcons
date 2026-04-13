package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleImage16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleImage16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5f)
            horizontalLineToRelative(2.744f)
            curveTo(10.126f, 3.252f, 8.459f, 2f, 6.5f, 2f)
            curveTo(4.015f, 2f, 2f, 4.015f, 2f, 6.5f)
            curveToRelative(0f, 1.96f, 1.252f, 3.626f, 3f, 4.244f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            close()
            moveToRelative(0f, 1f)
            curveTo(6.895f, 6f, 6f, 6.895f, 6f, 8f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.37f, 0.101f, 0.718f, 0.277f, 1.016f)
            lineToRelative(2.486f, -2.486f)
            curveToRelative(0.683f, -0.683f, 1.791f, -0.683f, 2.474f, 0f)
            lineToRelative(2.486f, 2.486f)
            curveTo(13.9f, 12.718f, 14f, 12.371f, 14f, 12f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(8f)
            close()
            moveToRelative(0f, 8f)
            curveToRelative(-0.37f, 0f, -0.718f, -0.101f, -1.016f, -0.277f)
            lineToRelative(2.486f, -2.486f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(2.486f, 2.486f)
            curveTo(12.718f, 13.9f, 12.371f, 14f, 12f, 14f)
            horizontalLineTo(8f)
            close()
            moveToRelative(3.5f, -4.75f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            close()
        }
    }.build()
}
