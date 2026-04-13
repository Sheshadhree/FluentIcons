package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowExit28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowExit28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(4.679f, 3f, 3f, 4.679f, 3f, 6.75f)
            verticalLineToRelative(14.5f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(6.75f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(10.5f)
            curveTo(17.664f, 4.5f, 18f, 4.164f, 18f, 3.75f)
            reflectiveCurveTo(17.664f, 3f, 17.25f, 3f)
            horizontalLineTo(6.75f)
            close()
            moveToRelative(13.53f, 4.97f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(4.22f, 4.22f)
            horizontalLineTo(9.75f)
            curveTo(9.336f, 13.25f, 9f, 13.586f, 9f, 14f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(13.69f)
            lineToRelative(-4.22f, 4.22f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineToRelative(5.5f, -5.5f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(-5.5f, -5.5f)
            close()
        }
    }.build()
}
