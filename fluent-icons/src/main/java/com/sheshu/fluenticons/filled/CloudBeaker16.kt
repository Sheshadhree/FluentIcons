package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudBeaker16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudBeaker16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.958f, 2f, 4.273f, 3.53f, 4.03f, 5.507f)
            curveTo(2.338f, 5.62f, 1f, 7.03f, 1f, 8.75f)
            curveTo(1f, 10.545f, 2.455f, 12f, 4.25f, 12f)
            horizontalLineToRelative(4.533f)
            lineToRelative(1.103f, -2.13f)
            curveToRelative(0.074f, -0.142f, 0.112f, -0.3f, 0.112f, -0.46f)
            verticalLineTo(7.914f)
            curveTo(9.416f, 7.707f, 9f, 7.152f, 9f, 6.5f)
            curveTo(9f, 5.672f, 9.672f, 5f, 10.5f, 5f)
            horizontalLineToRelative(1.374f)
            curveTo(11.43f, 3.275f, 9.864f, 2f, 8f, 2f)
            close()
            moveToRelative(5.996f, 7.405f)
            curveToRelative(0f, 0.32f, 0.076f, 0.635f, 0.224f, 0.92f)
            lineTo(14.57f, 11f)
            horizontalLineToRelative(-4.143f)
            lineToRelative(0.347f, -0.67f)
            curveToRelative(0.147f, -0.285f, 0.224f, -0.6f, 0.224f, -0.92f)
            verticalLineTo(7f)
            horizontalLineTo(10.5f)
            curveTo(10.224f, 7f, 10f, 6.776f, 10f, 6.5f)
            reflectiveCurveTo(10.224f, 6f, 10.5f, 6f)
            horizontalLineToRelative(4f)
            curveTo(14.776f, 6f, 15f, 6.224f, 15f, 6.5f)
            reflectiveCurveTo(14.776f, 7f, 14.5f, 7f)
            horizontalLineToRelative(-0.504f)
            verticalLineToRelative(2.405f)
            close()
            moveTo(9.909f, 12f)
            lineTo(9.11f, 13.54f)
            curveTo(8.767f, 14.206f, 9.25f, 15f, 10f, 15f)
            horizontalLineToRelative(4.998f)
            curveToRelative(0.75f, 0f, 1.233f, -0.794f, 0.888f, -1.46f)
            lineTo(15.087f, 12f)
            horizontalLineTo(9.91f)
            close()
        }
    }.build()
}
