package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TabArrowLeft24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TabArrowLeft24",
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
            curveToRelative(-0.463f, -0.297f, -0.966f, -0.536f, -1.5f, -0.709f)
            verticalLineTo(5.75f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(5.75f)
            curveTo(5.06f, 4.5f, 4.5f, 5.06f, 4.5f, 5.75f)
            verticalLineToRelative(12.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(5.563f)
            curveToRelative(0.173f, 0.534f, 0.412f, 1.037f, 0.709f, 1.5f)
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
