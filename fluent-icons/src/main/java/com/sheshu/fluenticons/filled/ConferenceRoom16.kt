package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ConferenceRoom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ConferenceRoom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.183f, 2.113f)
            curveTo(7.299f, 2.018f, 7.451f, 1.98f, 7.598f, 2.01f)
            lineToRelative(5f, 1f)
            curveTo(12.832f, 3.057f, 13f, 3.262f, 13f, 3.5f)
            verticalLineToRelative(8.997f)
            curveToRelative(0f, 0.238f, -0.168f, 0.443f, -0.402f, 0.49f)
            lineToRelative(-5f, 1f)
            curveToRelative(-0.147f, 0.03f, -0.3f, -0.008f, -0.415f, -0.103f)
            curveTo(7.067f, 13.789f, 7f, 13.647f, 7f, 13.497f)
            verticalLineTo(2.5f)
            moveToRelative(3f, 5.498f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            reflectiveCurveTo(9f, 7.722f, 9f, 7.998f)
            curveToRelative(0f, 0.277f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.223f, 0.5f, -0.5f)
            close()
            moveTo(6f, 3f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            verticalLineToRelative(8.997f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineTo(6f)
            verticalLineTo(3f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.183f, 2.113f)
            curveTo(7.067f, 2.208f, 7f, 2.35f, 7f, 2.5f)
            close()
        }
    }.build()
}
