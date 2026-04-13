package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PointScan20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PointScan20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2.5f)
            curveTo(9f, 2.224f, 8.776f, 2f, 8.5f, 2f)
            reflectiveCurveTo(8f, 2.224f, 8f, 2.5f)
            verticalLineToRelative(4.025f)
            curveTo(5.638f, 6.759f, 3.76f, 8.638f, 3.525f, 11f)
            horizontalLineTo(8f)
            verticalLineTo(6.525f)
            curveTo(8.164f, 6.508f, 8.331f, 6.5f, 8.5f, 6.5f)
            curveToRelative(0.169f, 0f, 0.336f, 0.008f, 0.5f, 0.025f)
            verticalLineTo(2.5f)
            close()
            moveTo(2.5f, 11f)
            horizontalLineToRelative(1.025f)
            curveTo(3.509f, 11.164f, 3.5f, 11.331f, 3.5f, 11.5f)
            curveToRelative(0f, 0.169f, 0.008f, 0.335f, 0.025f, 0.5f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 12f, 2f, 11.776f, 2f, 11.5f)
            reflectiveCurveTo(2.224f, 11f, 2.5f, 11f)
            close()
            moveTo(8f, 17.5f)
            verticalLineToRelative(-1.025f)
            curveTo(8.164f, 16.492f, 8.331f, 16.5f, 8.5f, 16.5f)
            curveToRelative(0.169f, 0f, 0.336f, -0.008f, 0.5f, -0.025f)
            verticalLineTo(17.5f)
            curveTo(9f, 17.776f, 8.776f, 18f, 8.5f, 18f)
            reflectiveCurveTo(8f, 17.776f, 8f, 17.5f)
            close()
            moveToRelative(5.476f, -5.5f)
            horizontalLineTo(17.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(17.776f, 11f, 17.5f, 11f)
            horizontalLineToRelative(-4.025f)
            curveToRelative(0.017f, 0.165f, 0.025f, 0.331f, 0.025f, 0.5f)
            curveToRelative(0f, 0.169f, -0.008f, 0.336f, -0.024f, 0.5f)
            horizontalLineTo(9f)
            verticalLineToRelative(4.475f)
            curveToRelative(2.362f, -0.234f, 4.241f, -2.113f, 4.476f, -4.475f)
            close()
            moveTo(8f, 16.475f)
            curveTo(5.638f, 16.241f, 3.76f, 14.362f, 3.525f, 12f)
            horizontalLineTo(8f)
            verticalLineToRelative(4.475f)
            close()
            moveTo(9f, 11f)
            horizontalLineToRelative(4.475f)
            curveTo(13.241f, 8.638f, 11.362f, 6.76f, 9f, 6.525f)
            verticalLineTo(11f)
            close()
        }
    }.build()
}
