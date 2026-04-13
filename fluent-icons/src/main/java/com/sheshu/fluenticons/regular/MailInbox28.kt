package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailInbox28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailInbox28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.75f, 3f)
            curveTo(23.545f, 3f, 25f, 4.455f, 25f, 6.25f)
            verticalLineToRelative(15.5f)
            curveToRelative(0f, 1.795f, -1.455f, 3.25f, -3.25f, 3.25f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 25f, 3f, 23.545f, 3f, 21.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineToRelative(15.5f)
            close()
            moveTo(4.5f, 21.75f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineTo(16.5f)
            horizontalLineToRelative(-5.316f)
            curveToRelative(-0.342f, 1.92f, -1.975f, 3.395f, -3.969f, 3.495f)
            lineTo(14f, 20f)
            curveToRelative(-2.02f, 0f, -3.71f, -1.408f, -4.143f, -3.296f)
            lineTo(9.816f, 16.5f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(5.25f)
            close()
            moveTo(21.75f, 4.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
            verticalLineTo(15f)
            horizontalLineToRelative(6f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            reflectiveCurveToRelative(2.75f, -1.231f, 2.75f, -2.75f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(17.5f, 15f)
            horizontalLineToRelative(6f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.966f, -0.784f, -1.75f, -1.75f, -1.75f)
            close()
        }
    }.build()
}
