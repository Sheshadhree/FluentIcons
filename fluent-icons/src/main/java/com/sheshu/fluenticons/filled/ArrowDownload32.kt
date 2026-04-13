package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowDownload32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowDownload32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.25f, 4.25f)
            curveTo(17.25f, 3.56f, 16.69f, 3f, 16f, 3f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            verticalLineToRelative(15.482f)
            lineToRelative(-4.616f, -4.616f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            reflectiveCurveToRelative(-0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(6.75f, 6.75f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(6.75f, -6.75f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineToRelative(-4.616f, 4.616f)
            verticalLineTo(4.25f)
            close()
            moveToRelative(-11f, 22.25f)
            curveTo(5.56f, 26.5f, 5f, 27.06f, 5f, 27.75f)
            reflectiveCurveTo(5.56f, 29f, 6.25f, 29f)
            horizontalLineToRelative(19.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveToRelative(-0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(6.25f)
            close()
        }
    }.build()
}
