package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonArrowBack32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonArrowBack32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveToRelative(-8.5f, 2f)
            curveTo(4.567f, 18f, 3f, 19.567f, 3f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(8.859f, 29.177f, 11.802f, 30f, 15f, 30f)
            curveToRelative(0.744f, 0f, 1.475f, -0.045f, 2.185f, -0.13f)
            curveTo(15.237f, 28.219f, 14f, 25.754f, 14f, 23f)
            curveToRelative(0f, -1.85f, 0.558f, -3.57f, 1.516f, -5f)
            horizontalLineTo(6.5f)
            close()
            moveTo(23f, 30.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(-1.22f, -10.22f)
            lineToRelative(-1.22f, 1.22f)
            horizontalLineToRelative(2.69f)
            curveToRelative(2.347f, 0f, 4.25f, 1.903f, 4.25f, 4.25f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(26f, 26.664f, 26f, 26.25f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineToRelative(-2.69f)
            lineToRelative(1.22f, 1.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineToRelative(-2.5f, -2.5f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(2.5f, -2.5f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            close()
        }
    }.build()
}
