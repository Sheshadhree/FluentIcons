package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ImageStack16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageStack16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(13f, 7f)
            horizontalLineToRelative(-2.293f)
            lineToRelative(-1.47f, -1.47f)
            curveToRelative(-0.683f, -0.683f, -1.791f, -0.683f, -2.474f, 0f)
            lineTo(5.293f, 7f)
            horizontalLineTo(3f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(7f)
            close()
            moveToRelative(0f, 1f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.762f, -0.569f, 1.392f, -1.305f, 1.488f)
            lineTo(9.237f, 10.53f)
            curveToRelative(-0.683f, -0.683f, -1.791f, -0.683f, -2.474f, 0f)
            lineToRelative(-2.458f, 2.458f)
            curveTo(3.57f, 12.892f, 3f, 12.262f, 3f, 11.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(10f)
            close()
            moveTo(9.293f, 7f)
            horizontalLineTo(6.707f)
            lineTo(7.47f, 6.237f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(9.293f, 7f)
            close()
            moveTo(8.53f, 11.237f)
            lineTo(10.293f, 13f)
            horizontalLineTo(5.707f)
            lineToRelative(1.763f, -1.763f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
            moveTo(12f, 4.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(10.5f, 5.164f, 10.5f, 4.75f)
            reflectiveCurveTo(10.836f, 4f, 11.25f, 4f)
            reflectiveCurveTo(12f, 4.336f, 12f, 4.75f)
            close()
            moveToRelative(-0.75f, 5.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(11.664f, 9f, 11.25f, 9f)
            reflectiveCurveTo(10.5f, 9.336f, 10.5f, 9.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
