package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TabArrowLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TabArrowLeft24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 5.75f)
            curveTo(3f, 4.231f, 4.231f, 3f, 5.75f, 3f)
            horizontalLineToRelative(12.5f)
            curveTo(19.769f, 3f, 21f, 4.231f, 21f, 5.75f)
            verticalLineToRelative(6.272f)
            curveToRelative(-0.605f, -0.388f, -1.28f, -0.678f, -2f, -0.848f)
            verticalLineTo(5.75f)
            curveTo(19f, 5.336f, 18.664f, 5f, 18.25f, 5f)
            horizontalLineTo(5.75f)
            curveTo(5.336f, 5f, 5f, 5.336f, 5f, 5.75f)
            verticalLineToRelative(12.5f)
            curveTo(5f, 18.664f, 5.336f, 19f, 5.75f, 19f)
            horizontalLineToRelative(5.424f)
            curveToRelative(0.17f, 0.72f, 0.46f, 1.395f, 0.848f, 2f)
            horizontalLineTo(5.75f)
            curveTo(4.231f, 21f, 3f, 19.769f, 3f, 18.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(17.5f, 23f)
            curveToRelative(-3.038f, 0f, -5.5f, -2.462f, -5.5f, -5.5f)
            reflectiveCurveToRelative(2.462f, -5.5f, 5.5f, -5.5f)
            reflectiveCurveToRelative(5.5f, 2.462f, 5.5f, 5.5f)
            reflectiveCurveToRelative(-2.462f, 5.5f, -5.5f, 5.5f)
            close()
            moveToRelative(3f, -5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(20.776f, 17f, 20.5f, 17f)
            horizontalLineToRelative(-4.793f)
            lineToRelative(1.647f, -1.646f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineToRelative(-2.5f, 2.5f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.5f, 2.5f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(15.707f, 18f)
            horizontalLineTo(20.5f)
            close()
        }
    }.build()
}
