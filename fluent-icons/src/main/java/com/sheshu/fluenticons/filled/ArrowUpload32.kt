package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpload32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpload32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.25f, 2f)
            curveTo(6.56f, 2f, 6f, 2.56f, 6f, 3.25f)
            reflectiveCurveTo(6.56f, 4.5f, 7.25f, 4.5f)
            horizontalLineToRelative(17.5f)
            curveTo(25.44f, 4.5f, 26f, 3.94f, 26f, 3.25f)
            reflectiveCurveTo(25.44f, 2f, 24.75f, 2f)
            horizontalLineTo(7.25f)
            close()
            moveToRelative(9.634f, 4.866f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            lineToRelative(-6.75f, 6.75f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            reflectiveCurveToRelative(1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(4.616f, -4.616f)
            verticalLineTo(28.75f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineTo(10.768f)
            lineToRelative(4.616f, 4.616f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            reflectiveCurveToRelative(0.488f, -1.28f, 0f, -1.768f)
            lineToRelative(-6.75f, -6.75f)
            close()
        }
    }.build()
}
