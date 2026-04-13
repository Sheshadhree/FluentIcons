package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailInbox24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailInbox24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 3f)
            horizontalLineToRelative(11.5f)
            curveToRelative(1.733f, 0f, 3.15f, 1.356f, 3.245f, 3.066f)
            lineTo(21f, 6.25f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.733f, -1.357f, 3.15f, -3.066f, 3.245f)
            lineTo(17.75f, 21f)
            horizontalLineTo(6.25f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(3f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.517f, 4.356f, 3.1f, 6.066f, 3.005f)
            lineTo(6.25f, 3f)
            horizontalLineToRelative(11.5f)
            horizontalLineToRelative(-11.5f)
            close()
            moveTo(4.5f, 14.5f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 0.918f, 0.707f, 1.671f, 1.606f, 1.744f)
            lineTo(6.25f, 19.5f)
            horizontalLineToRelative(11.5f)
            curveToRelative(0.918f, 0f, 1.671f, -0.707f, 1.744f, -1.607f)
            lineTo(19.5f, 17.75f)
            verticalLineTo(14.5f)
            horizontalLineToRelative(-3.825f)
            curveToRelative(-0.335f, 1.648f, -1.75f, 2.904f, -3.475f, 2.995f)
            lineTo(12f, 17.5f)
            curveToRelative(-1.747f, 0f, -3.215f, -1.195f, -3.632f, -2.812f)
            lineTo(8.325f, 14.5f)
            horizontalLineTo(4.5f)
            verticalLineToRelative(3.25f)
            verticalLineToRelative(-3.25f)
            close()
            moveToRelative(13.25f, -10f)
            horizontalLineTo(6.25f)
            curveToRelative(-0.918f, 0f, -1.671f, 0.707f, -1.744f, 1.606f)
            lineTo(4.5f, 6.25f)
            verticalLineTo(13f)
            horizontalLineTo(9f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(9.75f, 13.75f)
            curveTo(9.75f, 14.993f, 10.757f, 16f, 12f, 16f)
            curveToRelative(1.19f, 0f, 2.166f, -0.925f, 2.245f, -2.096f)
            lineToRelative(0.005f, -0.154f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(15f, 13f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.918f, -0.707f, -1.671f, -1.607f, -1.744f)
            lineTo(17.75f, 4.5f)
            close()
        }
    }.build()
}
