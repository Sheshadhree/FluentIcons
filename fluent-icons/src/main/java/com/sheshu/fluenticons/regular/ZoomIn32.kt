package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ZoomIn32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ZoomIn32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 7f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(4.5f)
            horizontalLineTo(19f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            horizontalLineToRelative(-4.5f)
            verticalLineTo(19f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-4.5f)
            horizontalLineTo(8f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(0f, -5f)
            curveTo(19.851f, 2f, 25f, 7.149f, 25f, 13.5f)
            curveToRelative(0f, 2.828f, -1.021f, 5.418f, -2.715f, 7.42f)
            lineToRelative(0.024f, -0.026f)
            lineToRelative(6.398f, 6.399f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.024f, 0f, 1.414f)
            curveToRelative(-0.39f, 0.39f, -1.024f, 0.39f, -1.414f, 0f)
            lineToRelative(-6.398f, -6.398f)
            curveToRelative(-2f, 1.68f, -4.58f, 2.691f, -7.395f, 2.691f)
            curveTo(7.149f, 25f, 2f, 19.851f, 2f, 13.5f)
            reflectiveCurveTo(7.149f, 2f, 13.5f, 2f)
            close()
            moveToRelative(0f, 2f)
            curveTo(8.253f, 4f, 4f, 8.253f, 4f, 13.5f)
            reflectiveCurveTo(8.253f, 23f, 13.5f, 23f)
            reflectiveCurveToRelative(9.5f, -4.253f, 9.5f, -9.5f)
            reflectiveCurveTo(18.747f, 4f, 13.5f, 4f)
            close()
        }
    }.build()
}
