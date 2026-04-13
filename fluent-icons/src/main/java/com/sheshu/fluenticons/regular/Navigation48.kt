package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Navigation48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Navigation48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 11.25f)
            curveTo(4f, 10.56f, 4.56f, 10f, 5.25f, 10f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 12.5f, 4f, 11.94f, 4f, 11.25f)
            close()
            moveToRelative(0f, 13f)
            curveTo(4f, 23.56f, 4.56f, 23f, 5.25f, 23f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineTo(5.25f)
            curveTo(4.56f, 25.5f, 4f, 24.94f, 4f, 24.25f)
            close()
            moveTo(5.25f, 36f)
            curveTo(4.56f, 36f, 4f, 36.56f, 4f, 37.25f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(37.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(43.44f, 36f, 42.75f, 36f)
            horizontalLineTo(5.25f)
            close()
        }
    }.build()
}
