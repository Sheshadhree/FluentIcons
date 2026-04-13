package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonMail16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonMail16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 10f)
            curveToRelative(0f, 1.507f, 1.086f, 3.047f, 3f, 3.69f)
            verticalLineToRelative(-1.068f)
            curveTo(3.7f, 12.072f, 3f, 11.005f, 3f, 10f)
            verticalLineTo(9.5f)
            curveTo(3f, 9.224f, 3.224f, 9f, 3.5f, 9f)
            horizontalLineTo(5f)
            curveToRelative(0f, -0.364f, 0.097f, -0.706f, 0.268f, -1f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 8f, 2f, 8.672f, 2f, 9.5f)
            verticalLineTo(10f)
            close()
            moveToRelative(5f, -8.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 7f, 7f, 7f)
            reflectiveCurveTo(4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(-0.966f, 0f, -1.75f, 0.784f, -1.75f, 1.75f)
            reflectiveCurveTo(6.034f, 6f, 7f, 6f)
            reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(7.966f, 2.5f, 7f, 2.5f)
            close()
            moveToRelative(3.51f, 9.427f)
            lineTo(6.013f, 9.304f)
            curveTo(6.109f, 8.568f, 6.738f, 8f, 7.5f, 8f)
            horizontalLineToRelative(6f)
            curveTo(14.328f, 8f, 15f, 8.672f, 15f, 9.5f)
            verticalLineToRelative(0.009f)
            lineToRelative(-4.49f, 2.418f)
            close()
            moveToRelative(0.227f, 1.013f)
            lineTo(15f, 10.645f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveTo(6.672f, 15f, 6f, 14.328f, 6f, 13.5f)
            verticalLineToRelative(-3.046f)
            lineToRelative(4.248f, 2.478f)
            curveToRelative(0.15f, 0.088f, 0.336f, 0.09f, 0.49f, 0.008f)
            close()
        }
    }.build()
}
